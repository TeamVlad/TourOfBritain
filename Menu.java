import java.io.*;
public class Menu {
    private String theTitle = null; //Title of menu
    private String[] theOptions; //Array of menu options
    private String thePrompt = "Please enter your choice: "; //Prompt to user
    private char minimumOption; //First menu item
    private char maximumOption; //Last menu item
    private BufferedReader keyboard = new  BufferedReader(new InputStreamReader(System.in)); //Buffer Reader
    
    public Menu(String title, String[] options, String prompt){ //Method to assign variables  
        if (title.length()>0){ //If title input contains something
            theTitle = title; //Make theTitle = title input
        }                 
        theOptions = options; //Make theOptions = input     
        if (prompt.length()>0){ //If prompt input contains something
            thePrompt = prompt; //Make thePrompt = prompt input
        }   
    }       

    public char offerMenu(){  //Method to display menu options and get valid choice
        char validResponse; //Char to store valid choice              
        showMenu(); //Display menu      
        validResponse = getValidChoice(); //Check valid choice
        return validResponse; //Return valie choice
    }    
    private void showMenu(){ //Method to show menu
        char thisOption = 'A'; //Char to store option   
        setMinimumOption(thisOption); //Set first menu item as option
        showTitle(); //Show title
        for (int i=0; i<theOptions.length; i++){ //Loop through options array
            showMenuLine(thisOption, i); //Display menu line with option
            thisOption++; //Increment option
        }        
        setMaximumOption(--thisOption); //Set last menu item as option - 1
    }    
    protected void showTitle(){ //Method to show title
        if (theTitle != null){ //If title isnt empty
            System.out.println ("\t" + theTitle + "\n"); //Print content of title
        }  
    }    
    protected void showMenuLine(char menuLabel, int menuText){ //Method to show menu line      
        System.out.println (menuLabel +".   " + theOptions[menuText]); //Print menu label and option     
    }    
    protected void setMinimumOption(char setTo){ //Method to set first menu item
        minimumOption = setTo; //Set first menu item to input
    }    
    protected void setMaximumOption(char setTo){ //Method to set last menu item
        maximumOption = setTo; //Set last menu item to input
    }    
    protected char getValidChoice(){ //Method to check valid choice  
        String fromKeyboard = null; //String to hold input
        char response = ' '; //char to hold response
        boolean invalidResponse = true; //Boolean for invalid response set to true as default
        System.out.println (thePrompt + " "); //Print prompt
        System.out.flush(); //Flush output stream to write data out to socket        
        while (invalidResponse){ //While invalid response = true
            try { //Try
                fromKeyboard = keyboard.readLine(); //Store input          
                if (fromKeyboard.length()>0){ //If more a character is input
                    response = fromKeyboard.charAt(0); //Convert to char
                }
                else { //Else
                    response = ' '; //Respone is nothing
                }                    
            }
            catch (java.io.IOException exception){ //Catch any errors                
            }      
            response = Character.toUpperCase(response); //Convert response to upper case     
            invalidResponse = ((response < minimumOption) || 
                    (response > maximumOption)); //check response is outside of minimum and maximum options
            if (invalidResponse){ //If invalid
                System.out.println ("Please enter a response between " + 
                        minimumOption + " and " + maximumOption + "."); //Tell user to input between minimum and maximum
                System.out.println (thePrompt + " "); //Print prompt again
                System.out.flush(); //Flisth output stream to write data out to socket
            }
        }
        return response; //Return response
    }
}    
