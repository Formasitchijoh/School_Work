void main(){
int i;
int ssDvec[5]={0X77,0X7C,0X39,0X5E,0X79};
TRISB=0X80;
PORTB=0X00;
while(1){
i=0;
while(i<5){
PORTB= ssDvec[i];
Delay_ms(100);
i++;
}
}

}