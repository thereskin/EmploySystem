package com.emp;
import java.util.*;
public class EmpSystem {
	private ArrayList al=null;
	//����Ա����̬����
	public EmpSystem(){
		al=new ArrayList<Employee>();
		
	}
	//����Ա��
	public void joinnew(String name,String num,double sal){
		Employee emp=new Employee();
		emp.setName(name);
		emp.setNum(num);
		emp.setSal(sal);
		al.add(emp);
	}
	//��ʾԱ����Ϣ
	public void showinfo(String num){
		//���ݱ���ҵ�Ա�����ڵ�λ��
		for(int i=0;i<al.size();i++)
		{
			//Employee emp=new Employee();
			Employee emp=(Employee)al.get(i);
			if(emp.getNum().equals(num))
			{
				System.out.println("Ա��������="+emp.getName());
				System.out.println("Ա���ı��="+emp.getNum());
				System.out.println("Ա���Ĺ���="+emp.getSal());
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
