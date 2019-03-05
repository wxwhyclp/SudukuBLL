package pkgHelper;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class LatinSquareTest {

	@Test
	public void hasDuplicates_test1() {
		int[]arr = {1,2,3,4,5};
		LatinSquare lq = new LatinSquare();
		
		assertFalse(lq.hasDuplicates(arr));
		}
	@Test
	public void hasDuplicates_test2() {
		int[]arr = {1,2,3,4,1};
		LatinSquare lq = new LatinSquare();
		
		assertTrue(lq.hasDuplicates(arr));
		}
	@Test
	public void hasDuplicates_test3() {
		int[]arr= {1,2,3,4,3};
		LatinSquare lq = new LatinSquare();
		
		assertTrue(lq.hasDuplicates(arr));
	}
	@Test
	public void doesElementExist_test1() {
		int[]arr= {1,2,3,4,3};
		int Value = 99;
		LatinSquare lq = new LatinSquare();
		assertFalse(lq.doesElementExist(arr, Value));
	}
	@Test
	public void ContainZero_test1() {
		LatinSquare lq = new LatinSquare();
		int[][] latinSquare = {{2,0,2},{2,1,2}};
		lq.setLatinSquare(latinSquare);
		assertTrue(lq.ContainsZero());
	}
	@Test
	public void ContainZero_test2() {
		LatinSquare lq = new LatinSquare();
		int[][] latinSquare = {{1,2},{1,2}};
		lq.setLatinSquare(latinSquare);
		assertFalse(lq.ContainsZero());
	}
	@Test
	public void hasAllValues_test1() {
		int[] arr1= {1,2,3};
		int[] arr2= {4,5,6};
		LatinSquare lq = new LatinSquare();
		assertFalse(lq.hasAllValues(arr1,arr2));
	}
	@Test
	public void hasAllValue_test2() {
		int[] arr1 = {1,2,3};
		int[] arr2 = {1,2,4};
		LatinSquare lq = new LatinSquare();
		assertFalse(lq.hasAllValues(arr1, arr2));
	}
	@Test
	public void hasAllValues_test3() {
		int[] arr1 = {1,2,3};
		int[] arr2 = {1,2,3};
		LatinSquare lq = new LatinSquare();
		assertTrue(lq.hasAllValues(arr1, arr2));
	}
	@Test
	public void hasAllValues_test4() {
		int[] arr1 = {1};
		int[] arr2 = {1,2};
		LatinSquare lq = new LatinSquare();
		assertFalse(lq.hasAllValues(arr1,arr2));
	}
	@Test
    public void getColumn_test1() {
	int iCol =1 ;
	LatinSquare lq = new LatinSquare();
	int[][] latinSquare= {{1,2,3},{2,3,1},{3,1,2}};
	lq.setLatinSquare(latinSquare);
	int[] compare = {2,3,1};
	
	assertTrue(Arrays.equals(lq.getColumn(iCol), compare));
	}
	@Test
    public void getColumn_test2() {
	int iCol =0 ;
	LatinSquare lq = new LatinSquare();
	int[][] latinSquare= {{1,2,3},{2,3,1},{3,1,2}};
	lq.setLatinSquare(latinSquare);
	int[] compare = {2,1,3};
	
	assertFalse(Arrays.equals(lq.getColumn(iCol), compare));
	}
	@Test
	public void getRow_test1() {
	int iRow =1 ;
	LatinSquare lq = new LatinSquare();
	int[][] latinSquare= {{1,2,3},{2,3,1},{3,1,2}};
	lq.setLatinSquare(latinSquare);
	int[] compare = {2,3,1};
	assertTrue(Arrays.equals(lq.getColumn(iRow), compare));
	}
	@Test
	public void getRow_test2() {
		int iRow =0 ;
		LatinSquare lq = new LatinSquare();
		int[][] latinSquare= {{1,2,3},{2,3,1},{3,1,2}};
		lq.setLatinSquare(latinSquare);
		int[] compare = {2,3,1};
		assertFalse(Arrays.equals(lq.getColumn(iRow), compare));
	}
	@Test
	public void isLatinSquare_test1() {
		
		LatinSquare lq = new LatinSquare();
		int[][] latinSquare= {{1,2,3},{2,3,1},{3,1,2}};
		lq.setLatinSquare(latinSquare);
		
		assertFalse(lq.isLatinSquare());
	}
	@Test
	public void isLatinSquare_test2() {
		
		LatinSquare lq = new LatinSquare();
		int[][] latinSquare= {{2,2,3},{2,3,1},{3,1,2}};
		lq.setLatinSquare(latinSquare);
		
		assertFalse(lq.isLatinSquare());
	}
}
