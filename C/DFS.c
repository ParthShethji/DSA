#include <stdio.h>
#include <stdlib.h>

int visited[7] = {0,0,0,0,0,0,0};
int a [7][7] = {
    {0,1,1,1,0,0,0},
    {1,0,1,0,0,0,0},
    {1,1,0,1,1,0,0},
    {1,0,1,0,1,0,0},
    {0,0,1,1,0,1,1},
    {0,0,0,0,1,0,0}, 
    {0,0,0,0,1,0,0} 
};

void dfs(int src){
    printf("%d", src);
    visited[src]=1;
    for (int i = 0; i < 7; i++)
    {
        if (a[src][i]==1 & visited[i]==0)
        {
            dfs(i);
        }
        
    }
    
}
int main(){
    dfs(0);
    return(0);
}