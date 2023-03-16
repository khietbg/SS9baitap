package bai1;

public class FindNextDay {
    public static String nextDay(int day, int month) {
        int nextD = 0;
        int nextM = 0;
        int arrDay[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31};
        int arrMon[]={1,2,3,4,5,6,7,8,9,10,11,12};

            if (day == arrDay[arrDay.length-1]){
                nextD = 1;
                for (int j = 0; j < arrMon.length; j++) {
                    if (arrMon[j]==month){
                        nextM = arrMon[j];
                    }
                }
            }else if (day<31&&day>=1){
                nextD = day +1;
                for (int k = 0; k < arrMon.length; k++) {
                    if (month == arrMon[k]){
                        nextM = arrMon[k];
                    }
                }
            }

        return nextD + " / " + nextM;
    }
}
