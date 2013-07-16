%%%%%%%%%% part A %%%%%%%%%%%%%%%%

is_set(S) :-
    setof(X, member(X, S), Set), 
    length(Set, Len), 
    length(S, Len).

%%% Tests I ran. %%%%%%%%%%%%%%%%%

% ?- is_set([1,2,3,4]).
% true.
% 
% ?- is_set([1,2,3,4,3]).
% false.

%%%%% part B %%%%%%%%%%%%%%%%%%%%%%%

equal(X,Y) :-
    subset(X,Y),
    subset(Y,X).

findUnion([X|Y],Z,W) :-
    member(X,Z),
    !,
    findUnion(Y,Z,W).

    findUnion([X|Y],Z,[X|W]) :-
        findUnion(Y,Z,W).

    findUnion([],Z,Z).

union(S1,S2,S3) :-
    findUnion(S1,S2,S4),
    equal(S4,S3).
    

%%% Tests I ran %%%%%%%%%%%%%%%%%%%%%

% ?- union([1,2],[3,4],X).
% X = [1, 2, 3, 4|_G965].
% 
% ?- union([1,2],[3,4],[1,2,3]).
% false.
% 
% ?- union([1,2],[3,4],[1,2,3,4]).
% true.

%%%%% Part C %%%%%%%%%%%%%%%%%%%%%%%%

findIntersection([],X,[]).

findIntersection([X|Xs], Y, [X|Z]) :-
    member(X,Y),
    findIntersection(Xs,Y,Z).

findIntersection([X|Xs], Y, Z) :- 
    findIntersection(Xs,Y,Z).


intersection(S1,S2,S3) :-
    findIntersection(S1,S2,S4),
    equal(S4,S3).

%%%% Tests I ran%%%%%%%%%%%%%%%%%%%%%

% ?- intersection([1,2],[1,2,3,4],[1,2]).
% true .
% 
% ?- intersection([1,2],[1,2,3,4],[1,2,3]).
% false.

