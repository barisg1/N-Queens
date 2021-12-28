#import files if needed
import random
from simpleai.search import SearchProblem
from simpleai.search.traditional import astar, breadth_first, depth_first, greedy, uniform_cost
from simpleai.search.viewers import WebViewer, BaseViewer

#class definition for NQueens
class NQueens(SearchProblem):
    def __init__(self, N):
        
        self.N = N
        self.state = self.set_state()
        initial_state = self.state
        super(NQueens,self).__init__(self.state)
        self._actions = []
        for i in range(self.N):
            for j in range(self.N):
                if i != j:
                    self._actions.append(("Move "+str(i+1)+" to "+str(j+1), (i, j + 1)))
        #print(self._actions)
    
    def __str__(self):
        return 'N: ' + str(self.N) + ', state: ' + str(self.state)
           
    def set_state(self):
        print("How do you want to set state?")
        print("1. Set state manually")
        print("2. Set state randomly")
        x = input("Enter selection: ")
        if x == "1":
            state = input("enter state: ")
            if self._is_valid(state):
                return state
            else:
                print("invalid state! try again")
                return self.set_state()
        elif x == "2":
            return self.generate_random_state()
        else:
            self.set_state()
    
    def generate_random_state(self):
        state = ""
        for i in range(self.N):
            state += str(random.randint(1, self.N))
        return state    
    
    def _is_valid(self,state_str):
        if len(state_str) == self.N and state_str.isdigit():
            state_int = [int(d)for d in state_str]
            for i in state_int:
                if int(i) <= self.N and int(i) > 0: 
                    continue
                else:
                    return False
            return True
        else:
            return False
     
    def count_attacking_pairs(self, state):
        board = []
        for i in range(len(state)):
            board.append(int(state[i]))
        attacking = 0
        row_count = [0] * len(board)
        
        diagonal_count = [0] * len(board) * 2
        second_diagonal_count = [0] * len(board) * 2
        
        #row check
        for i in range(len(board)):
            val = board[i]
            row_count[val-1] += 1
            
        for i in range(len(row_count)):
            attacking += (row_count[i] * (row_count[i]-1)) / 2
        
        #diagonal check
        for i in range(len(board)):
            val = board[i]
            sum_ = val + i
            diagonal_count[sum_] += 1
        for i in range(len(diagonal_count)):
            attacking += (diagonal_count[i] * (diagonal_count[i]-1)) / 2
        
        #second diagonal check
        for i in range(len(board)):
            val = board[i]
            sum_ = len(board) - val + i
            second_diagonal_count[sum_] += 1
        for i in range(len(second_diagonal_count)):
            attacking += (second_diagonal_count[i] * (second_diagonal_count[i]-1)) / 2

        return attacking
    def actions(self, state):
        return self._actions
    def result(self, state, action):  
        state_list = list(state)
        for i in range(len(state)):
            state_list[action[1][0]] = str(action[1][1])
        state = ''.join(state_list)
        return state
    def cost(self, state, action, state2):
        return self.count_attacking_pairs(state2)
    def is_goal(self, state):
        return self.count_attacking_pairs(state) == 0 
    def heuristic(self, state):
        return self.count_attacking_pairs(state)

# This is a test code. You can try with different N values and states.
myViewer = WebViewer()
problem = NQueens(4) #create NQueens instance
print(problem) #print the description of the problem
print("attacking " + str(problem.count_attacking_pairs(problem.state))) #print the total number of attacking pairs in the board
result = astar(problem, viewer=myViewer,graph_search=True)
print(result.path())
print(result.state)
print(result.cost)
print(myViewer.stats)
