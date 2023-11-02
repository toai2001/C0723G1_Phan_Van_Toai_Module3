

use demo12;
SELECT * FROM demo12.users;
 call display();

delimiter //
create procedure delete_by_id(in u_id int)
begin
delete from users where id = u_id;
end //
delimiter ;
call delete_by_id(6);



 
 