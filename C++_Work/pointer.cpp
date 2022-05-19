#include <iostream>
using namespace std;


int main(){

	//declare variables

	int var1 = 3;
	int var2 = 24;
	int var3 = 17;

	int *pointVar, var;
	var = 5;
	var1 = 50;
    pointVar = &var;
	*pointVar = var1;

    cout << *(pointVar= &var) << endl;
	//assign address of var to poitVar pointer

	//print addrees of var 

	cout <<"Address of var : " << &var1 << endl;

	cout <<"Address of var2: " << &var2 << endl;

	cout << "Address of var3 : " << & var3 << endl;
}