-- --------用户表的创建
create table my_forum_user_t(
                                id int(11) not null auto_increment  comment '主键id',
                                head_portrait varchar(50)  comment '用户头像',
                                account_num varchar(50) not null comment'登陆账号',
                                account_password varchar(50) not null comment '账号密码',
                                name varchar(20) not null default '无名者' comment '用户名字',
                                id_card varchar(50) not null default '暂无' comment '身份证',
                                e_mail varchar(40) not null default '暂无' comment '用户邮箱',
                                user_phone  varchar(20) not null default '暂无' comment '用户手机号',
                                create_day datetime not null comment '创建日期',
                                alter_day datetime comment  '最后一次修改时间',
                                PRIMARY KEY (id)
);