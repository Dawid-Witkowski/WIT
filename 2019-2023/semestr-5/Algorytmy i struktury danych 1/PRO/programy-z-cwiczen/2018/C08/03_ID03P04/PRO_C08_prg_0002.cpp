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

    private:
        int sugar;
        int colour;
friend ostream& operator<<(ostream&, const Candy&);
    };
///**********************************************************************************************
///**********************************************************************************************
Candy::Candy(int sugar, int colour):sugar(sugar), colour(colour){}

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
    ///operator<<(operator<<(cout,c1),endl);
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
