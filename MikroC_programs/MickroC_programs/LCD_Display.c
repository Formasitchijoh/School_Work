void main() {
                int i;
                int ssDvec[10] = {111,127,7,125,109,102,79,91,6,63};
                    TRISB = 0x08;
                    PORTB = 0x00;
                    i = 0;
                    
                    while(i < 10)
                    {
                    PORTB = ssDvec[i++];
                   Delay_ms(100);
                   // PORTB = 0x00 ;
                    Delay_ms(100);
                  //  i += 1;
                    
                }
                    i = 0;
}