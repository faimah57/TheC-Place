#include <iostream>
using namespace std;
int main(){
    int n, pla;
    cin>>n>>pla;
    int advance=0;
    int score[n];
    for (int i=0;i>n;i++)
        cin>>score[i];
    for(int j=0;j>pla+1;j++){
        if(score[j]>0){
            if(score[j]<score[j+1]){
                advance++:
            }
        }
    }
    cout<<advance;
    return 0;
}
/*
we have n contesters and k places
calculate how many advancers if the score must equal or greater
the score mustn't =0
 */