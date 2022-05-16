#include <iostream>
using namespace std;

//creating a structure datatype in C++

struct Vector{

	int sz; //number of elements
	double*elem; //ponter to  elements
};

void vector_init(Vector&v, int s){
	
	//the Vector& indicates that we pass v by non-const reference
	//that way vector_init() can modify the vector passed to it

	v.elem = new double[s];  //allocate an array of s doubles
	v.sz = s;
}

double read_and_sum(int s)
{
	//read s interger fron cin and return their sum

	Vector v;
	vector_init(v, s);
   cout<<"Enter the numbers into the array\n";

	for(int i = 0; i <= s; ++i){
		cin>>v.elem[i];
		cout<<"Just received one element\n";
	}

	double sum = 0;

	for(int i = 0; i!= s ; ++i){
		sum += v.elem[i];
	}
	return sum;
}

int main(){

 double result = read_and_sum(5);
 cout<< result;
 return 0;
}

