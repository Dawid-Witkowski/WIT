#include <iostream>
using std::cout;
using std::cin;
using std::endl;
using std::string;
using std::ostream;
using std::istream;
///**********************************************************************************************
///**********************************************************************************************
class MyApplication{
    public:
        void Main01();
        void Main02();
        void Main03();
        void Main04();
        void Main05();
    };
///**********************************************************************************************
///**********************************************************************************************
class Candy{
    public:
        Candy(int, int);
        int GetSugar();
        int GetColour();
        Candy operator+(const Candy&)const;
    private:
        int sugar;
        int colour;
friend ostream& operator<<(ostream&, const Candy&);
    };
///**********************************************************************************************
///**********************************************************************************************
class Box{
    public:
        Box(Candy, Candy);
        Box(){cout<<"BOX"<<endl;}
    private:
        Candy coco;
        Candy zozol;
    };
///**********************************************************************************************
///**********************************************************************************************
Candy::Candy(int sugar, int colour):sugar(sugar), colour(colour){}
///*********************************************Candy*************************************************
int Candy::GetSugar(){return sugar;}
///**********************************************************************************************
int Candy::GetColour(){return colour;}
///**********************************************************************************************
Candy Candy::operator+(const Candy& candy)const{
    return Candy(sugar+candy.sugar, colour + candy.colour);
    }
///**********************************************************************************************
ostream& operator<<(ostream& s, const Candy& candy){
    s<<"("<<candy.sugar<<", "<<candy.colour<<")";
    return s;
    }
///**********************************************************************************************
///**********************************************************************************************


///**********************************************************************************************
///**********************************************************************************************
void MyApplication::Main01(){
    Candy c1(1,2);
    Candy c2(3,4);
    cout<<c1<<endl;
    cout<<"sugar = "<<c1.GetSugar()<<endl;
    cout<<c1 + c2<<endl;
    cout<<c1.operator+(c2)<<endl;
    cout<<c1<<endl;
    }
///**********************************************************************************************
void MyApplication::Main02(){
    }
///**********************************************************************************************
void MyApplication::Main03(){
    }
///**********************************************************************************************
void MyApplication::Main04(){
    }
///**********************************************************************************************
void MyApplication::Main05(){
    }
///**********************************************************************************************
///**********************************************************************************************
int main(){
    (new MyApplication)->Main01();
    return 0;
    }
