#include <iostream>
using namespace std;

int main(){

	int sum = 0, value = 0, i = 0;

	//read untill end-of-file calculating a runnung total of all values read

   cout << "Enter the values";
	while( i < 5)
	{    
		cin >> value;
		sum += value; //
		cout << "Enter the values";
		i++;
	}

	cout << "Sum is : " << sum << endl;

	return 0;
}