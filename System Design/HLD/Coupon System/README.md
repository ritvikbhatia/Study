
# API Design

Post Coupons/
{
	config_id
}

POST configs
{
Coupon config - >  max no of coupons, discount percent/ abs,  max no of coupon per user, max no. of redemptions
}
Coupons

PUT coupons/{coupon_id}
{
}

GET coupons?discount: List of coupons

GET coupons/{coupon_id} : Coupon 

POST coupons/assign
{
Coupon_id
user_id
}

POST coupons/bulk_assign
{
coupon_id
users[]
}

POST coupons/apply
{
coupon_id
transaction_id
}

SQL
{
	coupon and user mapping
}

NO SQL
{
	Configs
}

# HLD 
![image](https://user-images.githubusercontent.com/41165330/214526778-ddeee3de-60e8-43d4-8332-81f012849236.png)

}
