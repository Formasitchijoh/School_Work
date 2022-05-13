#include<iostream>
using namespace std;

bool accept(){
	cout<<"Do you want to proceed(y or n)?\n";

	char answer = 0;
	cin>>answer;

	if(answer == 'y')
		return true;
	return false;
}
bool acept2(){
	cout<<"Do you want to proceed(y or n)?\n";  //write question

	char answer = 0;
	cin>>answer;  //read answer

	switch(answer){
		case 'y':
			return true;
		case 'n':
			return false;
		default:

		cout<<"I'll take that for a no.\n";
		return false;
	}
}

int main(){
	int test;
	int test2; 

	  if(accept)
	  	test = 1;
	  else
	  	test = 0;

	 switch(test){
	 	case 0:
		 	cout<<"Access granted\n";
		 	break;
	 	case 1:
		 	cout<<"pending............\n";
		 	break;
		 default:
		 	break;
	 }
	
	if (acept2)
		test2 = 1;
	
	 switch(test2){
	 	case 0:
		 	cout<<"Access granted\n";
		 	break;
	 	case 1:
		 	cout<<"pending............\n";
		 	break;
		 default:
		 	break;
		 }

}