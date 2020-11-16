select orderid, orders.custid,name, address,bookid
from customer, orders
where customer.custid=orders.custid
order by orders.custid;