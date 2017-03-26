package com.emp;
import java.util.*;
public class EmpSystem {
	private ArrayList al=null;
	//构造员工动态数组
	public EmpSystem(){
		al=new ArrayList<Employee>();
		
	}
	//加入员工
	public void joinnew(String name,String num,double sal){
		Employee emp=new Employee();
		emp.setName(name);
		emp.setNum(num);
		emp.setSal(sal);
		al.add(emp);
	}
	//显示员工信息
	public void showinfo(String num){
		//根据编号找到员工所在的位置
		for(int i=0;i<al.size();i++)
		{
			//Employee emp=new Employee();
			Employee emp=(Employee)al.get(i);
			if(emp.getNum().equals(num))
			{
				System.out.println("员工的名字="+emp.getName());
				System.out.println("员工的编号="+emp.getNum());
				System.out.println("员工的工资="+emp.getSal());
			}
		}
	}
	public void delete(String num)
	{
		for(int i=0;i<al.size();i++)
		{
			//Employee emp=new Employee();
			Employee emp=(Employee)al.get(i);
			if(emp.getNum().equals(num))
			{
				al.remove(num);
			}
		}
	}
	public void changesal(String num,double sal)
	{
		for(int i=0;i<al.size();i++)
		{
			//Employee emp=new Employee();
			Employee emp=(Employee)al.get(i);
			if(emp.getNum().equals(num))
			{
				emp.setSal(sal);
			}
		}
	}
}
