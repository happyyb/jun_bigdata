set serverout on;
declare n number:=1;
        v varchar2(20):='world';
begin
   dbms_output.put_line('hello'||n||v);
end;


set serverout on;
declare emp_count number;
begin
  select count(*) into emp_count from emp where sal>=3000;
  if emp_count>0 then
    dbms_output.put_line('��'||emp_count||'��Ա���Ļ���н�ʴ��ڵ���3000');
  else
    dbms_output.put_line('û��Ա���Ļ���н�ʴ��ڵ���3000'); 
  end if;
end;


set serverout on;
declare emp_count number;
begin
  select count(*) into emp_count from emp where sal>=3000;
  if emp_count=1 then
    dbms_output.put_line('��1��Ա���Ļ���н�ʴ��ڵ���3000');
  else if emp_count>1 then
    dbms_output.put_line('�г���1��Ա���Ļ���н�ʴ��ڵ���3000');
  else
    dbms_output.put_line('û��Ա���Ļ���н�ʴ��ڵ���3000'); 
  end if;
  end if;
end;

set serverout on;
declare emp_count number;
begin
  select count(*) into emp_count from emp where sal>=3000;
  case emp_count
    when 0 then dbms_output.put_line('û��Ա���Ļ���н�ʴ��ڵ���3000');
    when 1 then dbms_output.put_line('��1��Ա���Ļ���н�ʴ��ڵ���3000');
    when 2 then dbms_output.put_line('��2��Ա���Ļ���н�ʴ��ڵ���3000');
    when 3 then dbms_output.put_line('��3��Ա���Ļ���н�ʴ��ڵ���3000');
    else dbms_output.put_line('����3��Ա���Ļ���н�ʴ��ڵ���3000');
  end case;
end;

set serverout on;
declare g_id number:=2;
        g_losal number;
        g_hisal number;
begin
  loop
    if(g_id>4) then
      exit;
    end if;
    
    select losal,hisal into g_losal,g_hisal from salgrade where grade=g_id;
    dbms_output.put_line(g_id || '�ȼ������н��'|| g_losal || '�����н�ʣ�' || g_hisal);
    
    g_id:=g_id+1;
    
  end loop;
end;


set serverout on;
declare g_id number:=2;
        g_losal number;
        g_hisal number;
begin

  while g_id<5 loop
  
     select losal,hisal into g_losal,g_hisal from salgrade where grade=g_id;
     dbms_output.put_line(g_id || '�ȼ������н��'|| g_losal || '�����н�ʣ�' || g_hisal);   
     g_id:=g_id+1;
  end loop;

end;


set serverout on;
declare g_losal number;
        g_hisal number;
begin
  for g_id in 2..4 loop
    select losal,hisal into g_losal,g_hisal from salgrade where grade=g_id;
    dbms_output.put_line(g_id || '�ȼ������н��'|| g_losal || '�����н�ʣ�' || g_hisal);   
  end loop;
end;