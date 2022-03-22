public class MinMax {
    public static void main(String[] args) {
        int list[] = new int[10];


        for (int i = 0; i < list.length; i++ ){
            int randNum = (int) (Math.random()*(100-1));
            list[i] = randNum ;
        }

        int min = 101;
        int max = 0;

       for (int i = 0; i < list.length; i++){
           if (list[i] > max)
               max = list[i];
           if(list[i]<min)
               min = list [i];
       }
       System.out.println(max);
       System.out.println(min);
    }
}
