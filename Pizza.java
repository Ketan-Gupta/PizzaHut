class Pizza{

	//Type=Veg/Non-Veg
	//Toppings=Mushroom/Olives/No
	int costOfPizza,pizza_index;
	String type,topping,name,size;

	public Pizza()
	{
		this.type=null;
		this.topping=null;
		this.name=null;
		this.size=null;
	}
	
	public Pizza(int pizza_choice,String topping,String size)
	{
		this.pizza_index=pizza_choice;
		this.topping=topping;
		this.size=size;
	}

	/*
	public String toString()
	{
		return "Pizza:"+name+"\nToppings:"+topping+"\nType:"+type+"\nPreparation Time:"+timeForPreparation;
	}

	abstract public int calculateCost();
	*/
}

			//Implementation is carried out in seperate classes
			//Original classes are declared as interface
