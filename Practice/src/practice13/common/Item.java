package practice13.common;


public class Item{
	private String name;
	private int aditionalDamage;

		public String getname() {
			return this.name;
		}
		public void setname(String name) {
			this.name= name;
	}

		public int getaditionalDamage() {
			return this.aditionalDamage;
		}
		public void setaditionalDamage(int aditional) {
			this.aditionalDamage = aditional;
		}

		public Item(String name,int aditional){
			this.name = name;
			this.aditionalDamage =aditional;
		}
}
