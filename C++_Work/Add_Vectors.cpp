#include <iostream>
#include <vector>

using namespace std;

int main(){

	vector<int> num {1,2,3,4,5};

	cout << "Initial vector:"<<endl;

	for(const int &i : num){

		cout <<i << " ";
	}

	//add the integer 6 and 7 to the vector

	num.push_back(6);
	num.push_back(7);

	cout <<"\nUpdated Vector :"<<endl;

	for(const int& i : num){
		cout << i << " " << endl;
	}
	return 0;
}