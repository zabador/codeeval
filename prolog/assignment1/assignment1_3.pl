inv(0,1).
inv(1,0).

and(0,0,0).
and(0,1,0).
and(1,0,0).
and(1,1,1).

or(0,0,0).
or(0,1,1).
or(1,0,1).
or(1,1,1).

nand(X,Y,Z) :-
    and(X,Y,T),
    inv(Z,T).

circuit(A,B,C,Q) :-
    and(A,B,L1),
    or(B,C,L2),
    and(B,C,L3),
    and(L2,L3,L4),
    or(L1,L4,Q).

% Question A
% ?- circuit(X,Y,1,1).
% X = 0,
% Y = 1 ;
% X = Y, Y = 1.

% Question B
% 
% ?- circuit(X,Y,0,Q).
% X = Y, Y = Q, Q = 0 ;
% X = 0,
% Y = 1,
% Q = 0 ;
% X = 1,
% Y = Q, Q = 0 ;
% X = Y, Y = Q, Q = 1 ;


