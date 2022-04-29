
//
sbit LCD_RS at RB4_bit;
sbit LCD_EN at RB5_bit;
sbit LCD_D4 at RB0_bit;
sbit LCD_D5 at RB1_bit;
sbit LCD_D6 at RB2_bit;
sbit LCD_D7 at RB3_bit;

sbit LCD_RS_Direction at TRISB4_bit;
sbit LCD_EN_Direction at TRISB5_bit;
sbit LCD_D4_Direction at TRISB0_bit;
sbit LCD_D5_Direction at TRISB1_bit;
sbit LCD_D6_Direction at TRISB2_bit;
sbit LCD_D7_Direction at TRISB3_bit;

char ch[12];
long vlong;
unsigned int tmp;
int voltage;
float slope = 0.0048875855327;
void main() {
              TRISA = 0x01;
              PORTA= 0;
              TRISB = 0x00;
              PORTB = 0;

              LCD_Init();
              ADC_Init();
              LCD_Cmd(_LCD_CURSOR_OFF);
              LCD_Cmd(_LCD_CLEAR);
             LCD_Out(1, 1, "Digital volt");

              while(1) {

              tmp = ADC_Read(0);
              voltage = slope*tmp;   //
            vlong  = slope * tmp *2;
            FloatToStr_FixLen(vlong,ch,6);

            LCD_Out(2,2,ch);

            Lcd_chr_CP(' ');
            Lcd_chr_CP('V');
            Delay_ms(100);
               }
       }
