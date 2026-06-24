class Solution {
public:
    bool isValidBST(TreeNode* root) {
        return validate(root,LLONG_MIN,LLONG_MAX);
        
    }
    bool validate(TreeNode* root,long long low,long long high){
        if(root==NULL)
        {
            return true;
        }
        if(root->val<=low or root->val>=high){
            return false;
        }
        return validate(root->left,low,root->val) and validate(root->right,root->val,high);
         
     
    }
};
