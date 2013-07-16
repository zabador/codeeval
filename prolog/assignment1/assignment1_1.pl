
mother(X,Y) :-
    female(X),
    parent(X,Y).

father(X,Y) :-
    male(X),
    parent(X,Y).

grandson(X,Y) :-
    parent(Y,Z),
    parent(Z,X),
    male(X).

descendant(X,Y) :-
    parent(Y,X).

descendant(X,Y) :-
    parent(Y,Z),
    descendant(X,Z).

male(skyebig).
male(skyelittle).
male(vern).
parent(diane,skyelittle).
parent(skyebig, skyelittle).
parent(verne, skyebig).
parent(sandy, skyebig).

