#include <stdio.h>
#include <stdlib.h>

typedef struct STUDENT
{
    char value;
    struct STUDENT *next;
}NODE, *STU;

STU createList(char *arr, int count);
void deleteList(STU list);

int main(){
    char charArr[6]={'a','b','c','d','e','f'};

    STU P = createList(charArr, sizeof(charArr));
    deleteList(P);
    return 0;
}

STU createList(char *arr, int count){
    STU head;
    STU tail = head;
    char *temp = &(*arr);

    for (int i = 0; i < count; i++)
    {
        STU node = (STU)malloc(sizeof(NODE));
        (*node).value = *arr;
        (*node).next = NULL;
        if (head == NULL)
        {
            head = node;
            tail = node;
        }
        else
        {
            (*tail).next = node;
            tail = node;
        }
        arr++;
    }
    return head;
}

void deleteList(STU list){
    STU temp = NULL;

    do
    {
        temp = list -> next;
        free(list);
        list = temp;
    } while (temp != NULL);
}