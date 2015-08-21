package ch11.ex7;

public class Restaurant {
	public static void main(String[] args){
		Food food=new Food();
		
		Waitor waitor=new Waitor("웨이터",food);
		Chef chef=new Chef("주방장",food);
		
		waitor.start();
		try{
			waitor.sleep(1);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		chef.start();
	}
}

