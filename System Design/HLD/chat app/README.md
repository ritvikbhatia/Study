# Chat App

requirements

Chat ,
Group chat 
One to one 

thread( 1 level nested)


DB design

User
{
Id
Name
Email 
Hash
Profile_pic
}

Threads
{
Id
Creator_id
Text
Media
timestamp
}

Comments
{
Id
Text
Commenter_id
Thread_id
Media
timestamp
}

Groups
{
Id
Name
picture_url
}




Group_user_mapping
{
id
Group_id
member_id
}

Group_message_mapping
{
Id
Group_id
Sender_id
Message
time_stamp
}



API design



POST /threads/
{
Text
media
}

PUT thread/{thread_id}
{
text
}

DELETE threads/{thread_id}


GET posts?timestamp

GET post/{id}

POST /threads/{thread_id}/comments
{
Text,
Media
}

PUT ,DELETE
GET threads/{thread_id}/comments

POST groups
{
name,pic
}

POST groups/{group_id}/members
{
members=[]
}

POST groups/{group_id}/message?type=single
{
text
}


