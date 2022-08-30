package com.tw;

public class MultiplicationTable {
    public String create(int start, int end) {
        return null;
    }

    public Boolean isValid(int start, int end) {
        return isStartNotBiggerThanEnd(start,end) && isInRange(start) && isInRange(end);
    }

    public Boolean isInRange(int number) {
        return number>=1 && number<1000;
    }

    public Boolean isStartNotBiggerThanEnd(int start, int end) {
        return start<=end;
    }

    public String generateTable(int start, int end) {
        return null;
    }

    public String generateLine(int start, int row) {
        String rowLine = "";

        for(int startNum = start; startNum<=row;startNum++)
        {
            rowLine = rowLine + generateSingleExpression(startNum, row);

            if(startNum!=row){
                rowLine = rowLine + "  ";
            }
        }

        return rowLine;
    }

    public String generateSingleExpression(int multiplicand, int multiplier) {
        return multiplicand + "*" + multiplier + "=" + (multiplicand*multiplier);
    }
}
