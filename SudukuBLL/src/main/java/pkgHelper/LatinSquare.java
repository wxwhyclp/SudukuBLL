package pkgHelper;
import java.util.Arrays;

public class LatinSquare {
	private int [][] LatinSquare;
	private int[] arr;
	public LatinSquare()
	{
	}

	public LatinSquare(int[][] latinSquare) {
		super();
		LatinSquare = latinSquare;
	}

	public int[][] getLatinSquare() {
		return LatinSquare;
	}

	public void setLatinSquare(int[][] latinSquare) {
		LatinSquare = latinSquare;
	}
	
	public boolean hasDuplicates(int[] arr) {
		boolean hasDuplicates = false;
		if(arr == null) {
			return false;
		}
		Arrays.sort(arr);
		for(int i=0; i<arr.length-1;i++) {
			if (arr[i]==arr[i+1]) {
				hasDuplicates = true;
				break;
			}
			}
		return hasDuplicates;
	}
	public boolean doesElementExist(int[] arr, int value)
	{
		boolean doesElementExist = false;
		for(int i:arr) {
			if(i == value)
			{
				doesElementExist = false;
				break;
			
			}
		}
		return doesElementExist;
	}
	public boolean ContainZero(int[] arr) 
	{
		boolean ContainZero = false;
		for(int i:arr) {
			if(arr[i]!=0) {
				ContainZero = false;
				break;
				}
			else if(arr[i]==0){
				ContainZero = true;
				break;
			}
		}
		return ContainZero;
	}
	public int[] getColumn(int iCol) {
		int[] Col = new int[this.LatinSquare.length];
		for	(int row = 0; row < this.LatinSquare.length; row++) {
			Col[row] = LatinSquare[row][iCol];
		}
		return Col;
	}
	
	public int[] getRow(int iRow) {
		int[] Row = new int [this.LatinSquare.length];
		for (int col = 0; col< this.LatinSquare.length; col++) {
		}
		return Row;
		}
	public boolean hasAllValues(int[] arr1, int[] arr2)
	{
		boolean hasAllValues = false;
		if(arr1==null||arr2==null) {
			hasAllValues = false;
		}
		for(int i:arr1) {
			for(int x:arr2) {
				if(i==x) {
					hasAllValues = true;
					continue;
				}
				else {
					hasAllValues = false;
				}
			}
		}
		return hasAllValues;
	}
	public boolean isLatinSquare()
	{
		boolean isLatinSquare= false;
		for (int i =0; i<this.LatinSquare.length;i++) {
			if(hasDuplicates(getRow(arr[i])==false||hasDuplicates(getColumn(arr[i])==false)))
			{
				isLatinSquare = true;
			}
		}
		for (int j=0 ;j<this.LatinSquare.length-1;j++) {
			if(getRow(arr[j])==getRow(arr[j+1])){
				isLatinSquare = true;
			}
		}
		for (int k=0;k<this.LatinSquare.length-1;k++) {
			if(getColumn(arr[k])==getColumn(arr[k+1])){
				isLatinSquare = true;
			}
		}
	}

}
