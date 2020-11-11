#include<iostream>
#include<string>

using namespace std;


int main(){
    const int size = 4;

    int intgerArr[size] = {1, 2, 3, 4};

    for (int i = 0; i < size; i++)
    {
        cout << intgerArr[i];
    }

    cout << "\n";

    //other types of Array
    // String array
    const char *strings[size] = {"vin", "pat", "las", "masa"};

    for (int i = 0; i < size; i++){

        cout << strings[i] << "\t";
    }

    cout << "\n";

    // Other String

    string name[size] = {"leya", "jaya", "miya"};

    for (int i = 0; i < size; i++)
    {
        cout << name[i] << "\t";
    }

    cout << "\n";

    // Other arrays 
    // float

    float floating[size] = {2.3, 4.3, 5.5}; 

    for (int i = 0; i < size; i++)
    {
        cout << floating[i] << "\t";
    }
    
    cout << "\n";

    // Double 

    double doubleArr[size] = {4.5, 63.4, 4.55, 0.0};

    for (int i = 0; i < size; i++)
    {
        cout << doubleArr[i] << "\t";
    }

    cout << "\n";

    // Boolean

    bool BooleanArr[size] = {true, false, true};

    for (int i = 0; i < size; i++)
    {
        cout << BooleanArr[i] << "\t";
    }
    
    return 0;
}