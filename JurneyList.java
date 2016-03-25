import java.util.ArrayList;
import java.util.Objects;

public class JurneyList {
	private int numberOfJurneys;
	private ArrayList<Jurney> list;
	
	public JurneyList(){
		list = new ArrayList<Jurney>();
		numberOfJurneys = 0;
	}
	
	public void addToList(Jurney j){
		list.add(j);
		numberOfJurneys++;
		//System.out.println("element added, id:" + j.getId());;
	}
	
	public JurneyList getJurneysByStartDest(String start, String dest){
		JurneyList l = new JurneyList();
		for (Jurney v : this.list)
		      if(Objects.equals(start, v.getStart()) && Objects.equals(dest, v.getDestination())){
		    	  l.addToList(v);
		      }
		
		return l;
	}
	
	public JurneyList getJurneysByDate(String date){
		JurneyList l = new JurneyList();
		for (Jurney v : this.list){
		      if(Objects.equals(date, v.getDate())){
		    	  l.addToList(v);
		      }
		}
		return l;
		
	}
	
	public JurneyList getJurneysAfterTime(int t){
		JurneyList l = new JurneyList();
		for (Jurney v : this.list){
		      if(v.getTime() >= t){
		    	  l.addToList(v);
		      }
		}
		return l;
	}
	
	public Jurney getJurneyByIndex(int index){
		Jurney j;
		int i = 0;
		for (Jurney v : this.list){
		      if(i == (index-1)){
		    	  return v;
		      }
		      i++;
		}
		return null;
	}
	
	public void printList(){
		int i = 1;
		for (Jurney v : this.list){
			System.out.print("["+i+"] ");
			v.displayJurney();
			i++;
		}
		
	}
	
	public int getNumberOfJurneys(){
		return numberOfJurneys;
	}
}
