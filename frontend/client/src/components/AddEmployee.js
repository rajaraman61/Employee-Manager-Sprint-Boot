import React from 'react'

const AddEmployee = () => {
  return (
    <div className='flex max-w-2xl m-auto shadow-lg border-b bg-slate-100'>
        <div className='px-12 py-12'>
            <div className='font-thin text-2xl tracking-wider'>
                <h1>Add Employee</h1>
                <div className='items-center justify-center h-14 w-full my-4'>
                    <label className='block text-gray-500 text-sm font-normal'>First Name: </label>
                    <input type="text"  className='border h-10 w-96 mt-2 px-2 py-2'></input>
                </div>
                <div className='items-center justify-center h-14 w-full my-4'>
                    <label className='block text-gray-500 text-sm font-normal'>Last Name: </label>
                    <input type="text"  className='border h-10 w-96 mt-2 px-2 py-2'></input>
                </div>
                <div className='items-center justify-center h-14 w-full my-4'>
                    <label className='block text-gray-500 text-sm font-normal'>Email: </label>
                    <input type="text"  className='border h-10 w-96 mt-2 px-2 py-2'></input>
                </div>
                <div className='items-center justify-center h-14 w-full my-4 space-x-2 pt-4'>
                    <button className='rounded text-white font-semibold text-sm bg-slate-700 hover:bg-slate-500 py-2 px-4'>Save</button>
                    <button className='rounded text-white font-semibold text-sm bg-green-500 hover:bg-green-300 py-2 px-4'>Clear</button>
                </div>
            </div>
        </div>
    </div>
  )
}

export default AddEmployee