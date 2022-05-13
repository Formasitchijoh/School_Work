#include<iostream>
using namespace std;

void copy_fct(){

	int v1[10] = {0,1,2,3,4,5,6,7,8,9};
	int v2[10]; //to become a copy of V

	for(auto i = 0; i != 10; i++){
		v2[i] = v1[i];
	}

	//using for each loop to print out the value of V2

	for(auto x : v2)
		cout<<x<<'\n';
	cout<<"\nI just printed V2's content\n";

	for(auto x: {10,21,32,43,54,65})
		cout<<x<<'\n';
}

int main()
{
	copy_fct();
	return 0;
}