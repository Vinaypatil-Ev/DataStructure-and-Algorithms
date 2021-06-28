#include<iostream>
#include<string>
#include<vector>
#include<array>

using namespace std;

template<typename T>
void show(T arr[], int size, string msg) {
    for (int i=0; i<size; i++) {
        cout << arr[i] << " ";
    }
    cout << endl;
}

int main(){
    // declare array
    // datatype array_name[size] = {values...}
    const int size = 4;
    int a[size] = {1, 2, 3, 4}; // Interger Array
    float b[size] = {2.3, 4.3, 5.5}; // Float Array
    double c[size] = {4.5, 63.4, 4.55, 0.0}; // double array
    bool d[size] = {true, false, true}; // boolean array
    
    // string arrays
    string s_0[size] = {"str1", "str2", "str3"};
    const char *s_1[size] = {"str1", "str2", "str3"};
    char s_2[size][10] = {"str7", "str8", "str9"};
    vector<string> s_3 {"str10", "str11", "str12"};
    array<string, size> s_4 {"str13", "str14", "str15"};

    show<int>(a, size, "Integer array");
    show<float>(b, size, "float");
    show<double>(c, size, "double array");
    show<bool>(d, size, "boolean array");
    show<string>(s_0, size, "string_using_string");


    
    return 0;
}