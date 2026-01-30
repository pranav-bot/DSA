#include<iostream>
using namespace std;

struct ListNode
{
    int val;
    ListNode *next;
    ListNode() : val(0), next(nullptr){}
    ListNode(int x) : val(x), next(nullptr){}
    ListNode(int x, ListNode *next) : val(x), next(next){}
    
};

int getDecimalValue(ListNode* head) {
    int ans = 0;
    while(head!=nullptr){
        ans = ans*2 + head->val;
        head = head->next;
    }
    return ans;
}


int main(){
    ListNode* head = new ListNode(1, new ListNode(0, new ListNode(1)));
    int ans = getDecimalValue(head);
    cout<<ans;
    cout<<"\n";
    return 0;
}
