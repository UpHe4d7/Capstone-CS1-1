![image](https://github.com/user-attachments/assets/5c2dc29b-90fd-4f5e-b80e-773488ad834f)# Capstone-CS1-1
## Project Introduction
**Project number:** CS1

**Project Source:** School of Civil Engineering / Truji Pty Ltd

**Project Title:** Neighbourhood Walk - Bridging the gap within the community

**Project Description and Scope:** 

To create an application that enables 'Parents'
to register their interest for a neighbourhood walker, and for 'Walkers/ (people
who live within the neighbourhood), to register their interest in walking
children who are in primary school, to school. When a parent is able to find
their walker on the app, and the walker accepts the walk, a Neighbourhood
Walk is enabled.

**Expected outcomes/deliverables:** 

Website / Mobile App prototype with capabilities for self-registration and identity verification for both parents and
walker. The site/app should also help facilitate the search / advertising of the
walk and to help connect the two parties into agreeing to a walk agreement.
The user registration needs to be easy and seamless, with integrations to
existing identity verification systems to check things like home address,
working with children check, or even existing identity credential providers like
MyGov ID.

**Specific required knowledge, skills, and/or technology:**

• Mobile App development skills (flexible on any native or hybrid
development frameworks).
• Web Development skills (front end and some back-end development
skills required for the main use cases).
• Identity and Access Management / Identity Verification and integration
with existing Identity Proofing / Credentials providers.
• AI / Machine Learning will be a bonus to help pair and match parents /
walkers.

**Fields that this project may involve:** 
Web Development; Software
Development; Security/Networks; Cloud Computing; Mobile App
Development.

**Resources provided by the client:** 

We can provide any cloud services or
development tools if required.
The students need to find a dataset.

**Back-end method

对数据库中每个表有三个java文件分别是实体类，Mapper，Controller
1. 实体类：创建了一个类，包含了与一个表完全相同的属性以及简单的get和set方法，例如：WalkerProfile表有walker_id这个字段，在WalkerProfile.java这个class中同样有着Private String walkerId已经getWalkerId,setWalkerId两个方法。
2. Mapper：数据访问层，用来连接和操作数据库，我们创建的是继承了BaseMapper的Mapper interface因为baseMapper可以自动生成一些基础的CRUD操作，不需要人工去写，然后这个Mapper里面也可以自己写一些查询以应对特别一些的功能。
3. Controller：用来生成RESTful API，对不同的页面可以引用Mapper中不同的方法。


## Project member
* Chenkai Yao,530695260,cyao0459@uni.sydney.edu.au
* Ke Zhang,520280368,kzha0502@uni.sydney.edu.au
* Jiazhou Wu,530424316,jiwu0116@uni.sydney.edu.au
* Yue Gao,530775207,ygao0041@uni.sydney.edu.au
* Zebing Zhang,530201418,zzha0393@uni.sydney.edu.au
* Yunze Wu, 530442697, yuwu0745@uni.sydney.edu.au
* hello
* **Tutor**: Penghui Wen, penghui.wen@sydney.edu.au
* **Clients:**
  1. Amanda Ng, amanda.ng@sydney.edu.au
  2. Clarence Cheah, clarence@truji.id
