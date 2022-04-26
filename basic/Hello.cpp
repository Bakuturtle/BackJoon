#include <iostream>
#include <string>

using namespace std;

int main(void){
    int N = 100;
    int arr[N] = {0,};
    int cnt = 0, k;

    cin >> k;
    for (int i = 0; i < k; i++)
        cin >> arr[i];

    for(int j = 0; j < k; j++){
        if(arr[j] < 2) continue;
        for (int i = 2; i*i <=arr[j]; i++){
            if (arr[j] % i ==0) continue;
        }
        cnt +=1;
    }
    cout << cnt;

}