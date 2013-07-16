oddsize([X]).

oddsize([_,_|Xs]) :-
    oddsize(Xs).

% The Tests that I ran.
% ?- oddsize([1,2,3,4]).
% false.
% 
% ?- oddsize([1,2,3]).
% true .
% 
% ?- oddsize([1,2,3,4,5,6,7,8,9]).
% true .
% 
% ?- oddsize([1,2,3,4,5,6,7,8,9,10]).
% false.

