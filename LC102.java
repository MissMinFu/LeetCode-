package com.nowcoder.community.lc;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


/**
 * 深度优先搜索
 */
public class LC102 {
    public List<List<Integer>>  levelOrder(TreeNode root){
        List<List<Integer>>  res=new  ArrayList<List<Integer>>();
        if(root==null){
            return res;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int size=queue.size();
            List<Integer>  list=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode cur=queue.poll();
                list.add(cur.val);
                if(cur.left!=null){
                    queue.offer(cur.left);
                }
                if(cur.right!=null){
                    queue.offer(cur.right);
                }
            }
            res.add(list);
        }
        return  res;
    }
}
