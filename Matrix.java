public class Matrix {
 public static void main (string[] args) {
 int number;
 scanner sc = new scanner(System.in);
 int a = sc.nextInt();
 int range = number;
 int space = number * 2;
 int i, count=0,val=1, val_rng=1;
 while (range>0)
{
for (i=0;i<space;i++)
	System.out.println(" ");
space = space - 2;
while (count==0){
    int j = number+val_rng;
for (i=val_rng;i<j;i++){
System.out.println(""+i);
val+=1;
}
count = 1;
val_rng = val-1;
}
while {
    int k = val_rng+num;
for(i=k;i>val_rng;i--){
	System.out.println(""+i);
}
val=val+num;
val_rng = val;
count = 0;
}
range = range -1;
}
}
}