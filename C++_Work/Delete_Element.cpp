#include <iostream>
#include <vector>

using namespace std;

int main(){

	vector<int> prime_numbers{2,3,5,7};

	//initial vector

	unsigned int sizes  = prime_numbers.size();
	int  end = prime_numbers.back();

	cout << "Initial Vector :size  " << sizes << " last digit " << end << " check is empty " << prime_numbers.empty() << " : ";

	for(int i : prime_numbers){
		cout <<i << " ";
	}

	//remove thel ats element 

	prime_numbers.pop_back();

	//final vector

	cout << "\nUpdated Vector : " ;

	for(const int i : prime_numbers){
		cout << i << " ";
	} 

	return 0;
}