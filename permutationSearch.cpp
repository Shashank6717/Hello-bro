#include<iostream>
using namespace std;

//string 1 is to be searched in string 2(the searchable string)

bool isSame(int first[],int second[])
{
    for (int i = 0; i < 26; i++)
    {
        if(first[i]!=second[i])
            return false;
    }
    return true;
}


int main()
{
    bool flag=false;
    string s1="ab";
    string s2="cdejbagt";
    int firstFreq[26]={0};
    for(int i=0;i<s1.length();i++)
    {
        firstFreq[s1[i]-'a']++;
    }
    int winSize=s1.length();
    for(int i=0;i<s2.length();i++)
    {
        int winItr=0;
        int idx=i;
        int checkFreq[26]={0};
        while(winItr<winSize && idx<s2.length())
        {
            checkFreq[s2[idx]-'a']++;
            winItr++;
            idx++;
        }
    if(isSame(firstFreq,checkFreq))
    {
        flag=true;
        break;
    }
    }


    if(flag)
        cout<<"String Found";
    else
        cout<<"String not found";    


}