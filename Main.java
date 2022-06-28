class Main {
  public static void main(String[] args) {

    int[] tab=new int[5];
    tab[0]=1;
    tab[1]=2;
    tab[2]=3;
    tab[3]=4;
    tab[4]=5;
    int sum=0;
    for(int i=0;i<tab.length;i++)
        sum=sum+tab[i];
    System.out.println("Suma elementów tablicy wynosi "+sum);
  }
}