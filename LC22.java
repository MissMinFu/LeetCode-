package com.nowcoder.community.lc;

import java.util.ArrayList;
import java.util.List;

/**
 * 生成n对括号
 */
public class LC22 {
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        dfs(n,n,"",res);
        return res;
    }
    private void dfs(int left,int right,String str,List<String> res){
        if(left==0&&right==0){
            res.add(str);
            return;
        }
        if(left<right){
            dfs(left-1,right,str+"(",res);
        }
        if(left<right){
            dfs(left,right-1,str+")",res);
        }
    }
}
