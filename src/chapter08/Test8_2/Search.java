package chapter08.Test8_2;

class Search {
    public int minimum(int[] arrayData) {
        int minValue = Integer.MAX_VALUE;

        for (int anArrayData : arrayData) {
            if (anArrayData < minValue)
                minValue = anArrayData;
        }
        return minValue;
    }

    public int maximum(int[] arrayData) {
        int maxValue = Integer.MIN_VALUE;

        for (int anArrayData : arrayData) {
            if (anArrayData > maxValue)
                maxValue = anArrayData;
        }
        return maxValue;
    }
}
