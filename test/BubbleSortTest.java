/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import introduction.to.data.structures.algorithms.in.java.BubbleSort;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Oscar Bäck
 */
public class BubbleSortTest {
    
    public BubbleSortTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void bubbleSort1(){
        Assert.assertArrayEquals(new int[] {1,2,3,4,5},BubbleSort.BubbleArraySort(new int[] {2,3,1,4,5}));
    }
    
    @Test
    public void bubbleSort2(){
        Assert.assertArrayEquals(new int[] {1,2,3,4,5,6,7,8,9,10},BubbleSort.BubbleArraySort(new int[] {10,9,8,7,6,5,4,3,2,1}));
    }
    
    @Test
    public void bubbleSort3(){
        Assert.assertArrayEquals(new int[] {23,32,34,43,45,54,56,65,67,76},BubbleSort.BubbleArraySort(new int[] {76,23,67,32,65,34,56,54,45,43}));
    }
    
    @Test
    public void modbubbleSort1(){
        Assert.assertArrayEquals(new int[] {1,2,3,4,5},BubbleSort.ModBubbleArraySort(new int[] {2,3,1,4,5}));
    }
    
    @Test
    public void modbubbleSort2(){
        Assert.assertArrayEquals(new int[] {1,2,3,4,5,6,7,8,9,10},BubbleSort.ModBubbleArraySort(new int[] {10,9,8,7,6,5,4,3,2,1}));
    }
    
    @Test
    public void modbubbleSort3(){
        Assert.assertArrayEquals(new int[] {23,32,34,43,45,54,56,65,67,76},BubbleSort.ModBubbleArraySort(new int[] {76,23,67,32,65,34,56,54,45,43}));
    }
}
