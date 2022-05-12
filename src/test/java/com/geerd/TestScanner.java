package com.geerd;

import java.util.ArrayList;
import com.app.IScanner;

class TestScanner implements IScanner{

    int intValue;
    String stringValue;
    double doubleValue;

    public void setInt(int x){
        this.intValue = x;
    }

    public void setString(String x){
        this.stringValue = x;
    }

    public void setDouble (double x){
        this.doubleValue = x;
    }

    @Override
    public int nextInt() {
        return intValue;
    }

    @Override
    public String nextLine() {
        return stringValue;
    }

    @Override
    public double nextDouble() {
     return 0;
    }
}

class RepeatingTestScanner extends TestScanner{
    ArrayList<String> sendlist = new ArrayList<>();
    ArrayList<Integer> intlist = new ArrayList<>();
    int counter = 0;
    int intCounter = 0;

    @Override
    public String nextLine() {
        this.stringValue = sendlist.get(counter);
        if(counter < sendlist.size()-1)
            counter++;
        return super.nextLine();
    }
    @Override
    public int nextInt() {
        this.intValue = intlist.get(intCounter);
        if(intCounter < intlist.size()-1)
            intCounter++;
        return super.nextInt();
    }

    public void clear() {
        this.sendlist.clear();
        this.counter = 0;
        this.intCounter = 0;
        this.intlist.clear();
    }
}
