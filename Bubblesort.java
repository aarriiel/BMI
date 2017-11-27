//U10616006 ³\®fºÕ 2017/11/27
//make a method to bubblesort.
public class Bubblesort{
	private String[] name=new String[5];
	private int[] sortArray=new int[5];
	private String tempN;
	private int tempA;
	public Bubblesort(String[] name, int[] sortArray){
		this.name=name;
		this.sortArray=sortArray;
	}
	public void temp(int j){
		tempN=name[j];
		name[j]=name[j+1];
		name[j+1]=tempN;
		tempA=sortArray[j];
		sortArray[j]=sortArray[j+1];
		sortArray[j+1]=tempA;
	}
	public void bubblesort(){
		boolean keep=true;
		for(int i=0;i<sortArray.length-1&&keep;i++){
			keep=false;
			for(int j=0;j<sortArray.length-i-1;j++){
				if(name[j].compareTo(name[j+1])>0){
					temp(j);
					keep=true;
				}
			}	
		}
	}
}
