//      LCD module connections
sbit LCD_RS at RB0_bit;
sbit LCD_EN at RB2_bit;
sbit LCD_D4 at RB3_bit;
sbit LCD_D5 at RB4_bit;
sbit LCD_D6 at RB5_bit;
sbit LCD_D7 at RB6_bit;

sbit LCD_RS_Direction at TRISB0_bit;
sbit LCD_EN_Direction at TRISB2_bit;
sbit LCD_D4_Direction at TRISB3_bit;
sbit LCD_D5_Direction at TRISB4_bit;
sbit LCD_D6_Direction at TRISB5_bit;
sbit LCD_D7_Direction at TRISB6_bit;

//End LCD module connection

//modification by Dr Marshal
char txt3[] = "Lcdsbit";
char txt4[] = "example";
 void main() {
          TRISB = 0;
          PORTB = 0x00;
          Lcd_Init();
          
          //Lcd_Cmd(_Lcd_CURSOR_OFF) ;
          
          while(1)
          {
          //Run the following for infinite times
          Lcd_Cmd(_Lcd_CLEAR); 
          //lcd_Cmd(_Lcd_CURSOR_OFF); //Erase  the dislay
          // Lcd_Out(1,1, "Name");
          Lcd_Out(1,2,txt3);
          Delay_ms(150);
          Lcd_Cmd(_Lcd_CnURSOR_OFF);
          Lcd_Cmd(_Lcd_CLEAR); //erase the display
          Lcd_Out(1,1,txt4);
          Delay_ms(200);
          Lcd_Out(2,1,"pridence");
          Delay_ms(200);
          }
          
 }